package stdgui.data.model.modelwrapper;


    
    


     

public class AssignedLinSlaveConfigRefWrapper {

    
    
    private AssignedLinSlaveConfigRef assignedLinSlaveConfigRef;

    public AssignedLinSlaveConfigRefWrapper(AssignedLinSlaveConfigRef assignedLinSlaveConfigRef) {
        this.assignedLinSlaveConfigRef = assignedLinSlaveConfigRef;
    }

   
    public LinSlaveConfigIdentSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(assignedLinSlaveConfigRef.getDest())) {
            
            return assignedLinSlaveConfigRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAssignedLinSlaveConfigRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = assignedLinSlaveConfigRef.getValue();
        java.lang.String type = assignedLinSlaveConfigRef.getDest().toString().replace("_", "-");
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

    
    public LinSlaveConfigIdentWrapper getLinSlaveConfigIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = assignedLinSlaveConfigRef.getValue();
        java.lang.String type = assignedLinSlaveConfigRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LinSlaveConfigIdent){
            return new LinSlaveConfigIdentWrapper((LinSlaveConfigIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}