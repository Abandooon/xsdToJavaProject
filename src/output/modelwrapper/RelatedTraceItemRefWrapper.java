package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

     

     

     

     

     

     

     

     

     

public class RelatedTraceItemRefWrapper {

    
    
    private RelatedTraceItemRef relatedTraceItemRef;

    public RelatedTraceItemRefWrapper(RelatedTraceItemRef relatedTraceItemRef) {
        this.relatedTraceItemRef = relatedTraceItemRef;
    }

   
    public TraceableSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(relatedTraceItemRef.getDest())) {
            
            return relatedTraceItemRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRelatedTraceItemRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
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

    
    public AgeConstraintWrapper getAgeConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof AgeConstraint){
            return new AgeConstraintWrapper((AgeConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ArbitraryEventTriggeringWrapper getArbitraryEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ArbitraryEventTriggering){
            return new ArbitraryEventTriggeringWrapper((ArbitraryEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public BurstPatternEventTriggeringWrapper getBurstPatternEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof BurstPatternEventTriggering){
            return new BurstPatternEventTriggeringWrapper((BurstPatternEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ConcretePatternEventTriggeringWrapper getConcretePatternEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConcretePatternEventTriggering){
            return new ConcretePatternEventTriggeringWrapper((ConcretePatternEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExecutionOrderConstraintWrapper getExecutionOrderConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExecutionOrderConstraint){
            return new ExecutionOrderConstraintWrapper((ExecutionOrderConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ExecutionTimeConstraintWrapper getExecutionTimeConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ExecutionTimeConstraint){
            return new ExecutionTimeConstraintWrapper((ExecutionTimeConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public LatencyTimingConstraintWrapper getLatencyTimingConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof LatencyTimingConstraint){
            return new LatencyTimingConstraintWrapper((LatencyTimingConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public OffsetTimingConstraintWrapper getOffsetTimingConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof OffsetTimingConstraint){
            return new OffsetTimingConstraintWrapper((OffsetTimingConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public PeriodicEventTriggeringWrapper getPeriodicEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof PeriodicEventTriggering){
            return new PeriodicEventTriggeringWrapper((PeriodicEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SporadicEventTriggeringWrapper getSporadicEventTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SporadicEventTriggering){
            return new SporadicEventTriggeringWrapper((SporadicEventTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    public StructuredReqWrapper getStructuredReq() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof StructuredReq){
            return new StructuredReqWrapper((StructuredReq) queryObject);
        }else{
            return null;
        }
        
    }
    
    public SynchronizationTimingConstraintWrapper getSynchronizationTimingConstraint() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SynchronizationTimingConstraint){
            return new SynchronizationTimingConstraintWrapper((SynchronizationTimingConstraint) queryObject);
        }else{
            return null;
        }
        
    }
    
    public TraceableTextWrapper getTraceableText() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = relatedTraceItemRef.getValue();
        java.lang.String type = relatedTraceItemRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TraceableText){
            return new TraceableTextWrapper((TraceableText) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}