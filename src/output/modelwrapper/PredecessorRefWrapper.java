package stdgui.data.model.modelwrapper;


    
    


     

     

     

public class PredecessorRefWrapper {

    
    
    private PredecessorRef predecessorRef;

    public PredecessorRefWrapper(PredecessorRef predecessorRef) {
        this.predecessorRef = predecessorRef;
    }

   
    public CouplingPortStructuralElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(predecessorRef.getDest())) {
            
            return predecessorRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPredecessorRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = predecessorRef.getValue();
        java.lang.String type = predecessorRef.getDest().toString().replace("_", "-");
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

    
    public CouplingPortFifoWrapper getCouplingPortFifo() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = predecessorRef.getValue();
        java.lang.String type = predecessorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortFifo){
            return new CouplingPortFifoWrapper((CouplingPortFifo) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingPortSchedulerWrapper getCouplingPortScheduler() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = predecessorRef.getValue();
        java.lang.String type = predecessorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortScheduler){
            return new CouplingPortSchedulerWrapper((CouplingPortScheduler) queryObject);
        }else{
            return null;
        }
        
    }
    
    public CouplingPortShaperWrapper getCouplingPortShaper() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = predecessorRef.getValue();
        java.lang.String type = predecessorRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CouplingPortShaper){
            return new CouplingPortShaperWrapper((CouplingPortShaper) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}