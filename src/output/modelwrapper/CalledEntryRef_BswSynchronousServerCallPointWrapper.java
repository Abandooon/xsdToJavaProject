package stdgui.data.model.modelwrapper;


    
    


     

public class CalledEntryRef_BswSynchronousServerCallPointWrapper {

    
    
    private CalledEntryRef_BswSynchronousServerCallPoint calledEntryRef_BswSynchronousServerCallPoint;

    public CalledEntryRef_BswSynchronousServerCallPointWrapper(CalledEntryRef_BswSynchronousServerCallPoint calledEntryRef_BswSynchronousServerCallPoint) {
        this.calledEntryRef_BswSynchronousServerCallPoint = calledEntryRef_BswSynchronousServerCallPoint;
    }

   
    public BswModuleClientServerEntrySubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(calledEntryRef_BswSynchronousServerCallPoint.getDest())) {
            
            return calledEntryRef_BswSynchronousServerCallPoint.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCalledEntryRef_BswSynchronousServerCallPointObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = calledEntryRef_BswSynchronousServerCallPoint.getValue();
        java.lang.String type = calledEntryRef_BswSynchronousServerCallPoint.getDest().toString().replace("_", "-");
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

    
    public BswModuleClientServerEntryWrapper getBswModuleClientServerEntry() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = calledEntryRef_BswSynchronousServerCallPoint.getValue();
        java.lang.String type = calledEntryRef_BswSynchronousServerCallPoint.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BswModuleClientServerEntry){
            return new BswModuleClientServerEntryWrapper((BswModuleClientServerEntry) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}