package stdgui.data.model.modelwrapper;


    
    


     

public class EnableConditionGroupRefWrapper {

    
    
    private EnableConditionGroupRef enableConditionGroupRef;

    public EnableConditionGroupRefWrapper(EnableConditionGroupRef enableConditionGroupRef) {
        this.enableConditionGroupRef = enableConditionGroupRef;
    }

   
    public DiagnosticEnableConditionGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(enableConditionGroupRef.getDest())) {
            
            return enableConditionGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEnableConditionGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = enableConditionGroupRef.getValue();
        java.lang.String type = enableConditionGroupRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticEnableConditionGroupWrapper getDiagnosticEnableConditionGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = enableConditionGroupRef.getValue();
        java.lang.String type = enableConditionGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEnableConditionGroup){
            return new DiagnosticEnableConditionGroupWrapper((DiagnosticEnableConditionGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}