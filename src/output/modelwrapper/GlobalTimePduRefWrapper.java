package stdgui.data.model.modelwrapper;


    
    


     

public class GlobalTimePduRefWrapper {

    
    
    private GlobalTimePduRef globalTimePduRef;

    public GlobalTimePduRefWrapper(GlobalTimePduRef globalTimePduRef) {
        this.globalTimePduRef = globalTimePduRef;
    }

   
    public GeneralPurposePduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(globalTimePduRef.getDest())) {
            
            return globalTimePduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getGlobalTimePduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = globalTimePduRef.getValue();
        java.lang.String type = globalTimePduRef.getDest().toString().replace("_", "-");
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

    
    public GeneralPurposePduWrapper getGeneralPurposePdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = globalTimePduRef.getValue();
        java.lang.String type = globalTimePduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof GeneralPurposePdu){
            return new GeneralPurposePduWrapper((GeneralPurposePdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}