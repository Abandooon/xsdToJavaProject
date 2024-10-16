package stdgui.data.model.modelwrapper;


    
    


     

public class TargetDataPrototypeGroupRefWrapper {

    
    
    private TargetDataPrototypeGroupRef targetDataPrototypeGroupRef;

    public TargetDataPrototypeGroupRefWrapper(TargetDataPrototypeGroupRef targetDataPrototypeGroupRef) {
        this.targetDataPrototypeGroupRef = targetDataPrototypeGroupRef;
    }

   
    public DataPrototypeGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(targetDataPrototypeGroupRef.getDest())) {
            
            return targetDataPrototypeGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTargetDataPrototypeGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = targetDataPrototypeGroupRef.getValue();
        java.lang.String type = targetDataPrototypeGroupRef.getDest().toString().replace("_", "-");
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

    
    public DataPrototypeGroupWrapper getDataPrototypeGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = targetDataPrototypeGroupRef.getValue();
        java.lang.String type = targetDataPrototypeGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DataPrototypeGroup){
            return new DataPrototypeGroupWrapper((DataPrototypeGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}