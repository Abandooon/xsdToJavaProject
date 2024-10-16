package stdgui.data.model.modelwrapper;


    
    


     

public class SourceRefWrapper {

    
    
    private SourceRef sourceRef;

    public SourceRefWrapper(SourceRef sourceRef) {
        this.sourceRef = sourceRef;
    }

   
    public FlexrayArTpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(sourceRef.getDest())) {
            
            return sourceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSourceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = sourceRef.getValue();
        java.lang.String type = sourceRef.getDest().toString().replace("_", "-");
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

    
    public FlexrayArTpNodeWrapper getFlexrayArTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = sourceRef.getValue();
        java.lang.String type = sourceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayArTpNode){
            return new FlexrayArTpNodeWrapper((FlexrayArTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}