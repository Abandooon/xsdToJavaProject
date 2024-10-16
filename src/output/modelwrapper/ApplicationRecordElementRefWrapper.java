package stdgui.data.model.modelwrapper;


    
    


     

public class ApplicationRecordElementRefWrapper {

    
    
    private ApplicationRecordElementRef applicationRecordElementRef;

    public ApplicationRecordElementRefWrapper(ApplicationRecordElementRef applicationRecordElementRef) {
        this.applicationRecordElementRef = applicationRecordElementRef;
    }

   
    public ApplicationRecordElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(applicationRecordElementRef.getDest())) {
            
            return applicationRecordElementRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getApplicationRecordElementRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = applicationRecordElementRef.getValue();
        java.lang.String type = applicationRecordElementRef.getDest().toString().replace("_", "-");
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

    
    public ApplicationRecordElementWrapper getApplicationRecordElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = applicationRecordElementRef.getValue();
        java.lang.String type = applicationRecordElementRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ApplicationRecordElement){
            return new ApplicationRecordElementWrapper((ApplicationRecordElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}