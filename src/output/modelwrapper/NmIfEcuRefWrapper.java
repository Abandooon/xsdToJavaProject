package stdgui.data.model.modelwrapper;


    
    


     

public class NmIfEcuRefWrapper {

    
    
    private NmIfEcuRef nmIfEcuRef;

    public NmIfEcuRefWrapper(NmIfEcuRef nmIfEcuRef) {
        this.nmIfEcuRef = nmIfEcuRef;
    }

   
    public NmEcuSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(nmIfEcuRef.getDest())) {
            
            return nmIfEcuRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getNmIfEcuRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = nmIfEcuRef.getValue();
        java.lang.String type = nmIfEcuRef.getDest().toString().replace("_", "-");
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

    
    public NmEcuWrapper getNmEcu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nmIfEcuRef.getValue();
        java.lang.String type = nmIfEcuRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmEcu){
            return new NmEcuWrapper((NmEcu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}