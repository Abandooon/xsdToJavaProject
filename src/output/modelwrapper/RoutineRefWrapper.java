package stdgui.data.model.modelwrapper;


    
    


     

public class RoutineRefWrapper {

    
    
    private RoutineRef routineRef;

    public RoutineRefWrapper(RoutineRef routineRef) {
        this.routineRef = routineRef;
    }

   
    public DiagnosticRoutineSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(routineRef.getDest())) {
            
            return routineRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRoutineRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = routineRef.getValue();
        java.lang.String type = routineRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticRoutineWrapper getDiagnosticRoutine() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = routineRef.getValue();
        java.lang.String type = routineRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticRoutine){
            return new DiagnosticRoutineWrapper((DiagnosticRoutine) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}