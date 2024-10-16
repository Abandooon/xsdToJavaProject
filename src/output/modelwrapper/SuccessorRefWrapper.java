package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class SuccessorRefWrapper {

    
    
    private SuccessorRef successorRef;

    public SuccessorRefWrapper(SuccessorRef successorRef) {
        this.successorRef = successorRef;
    }

   
    public EocExecutableEntityRefAbstractSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(successorRef.getDest())) {
            
            return successorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getSuccessorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = successorRef.getValue();
        java.lang.String type = successorRef.getDest().toString().replace("_", "-");
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

    
    public EocEventRefWrapper getEocEventRef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = successorRef.getValue();
        java.lang.String type = successorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocEventRef){
            return new EocEventRefWrapper((EocEventRef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EocExecutableEntityRefWrapper getEocExecutableEntityRef() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = successorRef.getValue();
        java.lang.String type = successorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocExecutableEntityRef){
            return new EocExecutableEntityRefWrapper((EocExecutableEntityRef) queryObject);
        }else{
            return null;
        }
        
    }
    
    public EocExecutableEntityRefGroupWrapper getEocExecutableEntityRefGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = successorRef.getValue();
        java.lang.String type = successorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof EocExecutableEntityRefGroup){
            return new EocExecutableEntityRefGroupWrapper((EocExecutableEntityRefGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}