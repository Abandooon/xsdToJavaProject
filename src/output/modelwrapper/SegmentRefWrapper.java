package stdgui.data.model.modelwrapper;


    
    


     

public class SegmentRefWrapper {

    
    
    private SegmentRef segmentRef;

    public SegmentRefWrapper(SegmentRef segmentRef) {
        this.segmentRef = segmentRef;
    }

   
    public TimingDescriptionEventChainSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(segmentRef.getDest())) {
            
            return segmentRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSegmentRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = segmentRef.getValue();
        java.lang.String type = segmentRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        java.lang.String className = schemaController.convertClassName(type);
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        java.lang.String wrapperClassName = "" + className + "Wrapper";
        Class<?> wrapperClass = Class.forName(wrapperClassName);
        Constructor<?> wrapperConstructor = wrapperClass.getConstructor(queryObject.getClass());
        Object wrapperInstance = wrapperConstructor.newInstance(queryObject);
        return wrapperInstance;
    }

    
    public TimingDescriptionEventChainWrapper getTimingDescriptionEventChain() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = segmentRef.getValue();
        java.lang.String type = segmentRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TimingDescriptionEventChain){
            return new TimingDescriptionEventChainWrapper((TimingDescriptionEventChain) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}