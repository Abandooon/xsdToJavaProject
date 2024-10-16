package stdgui.data.model.modelwrapper;


    
    


     

public class ScopeRef_LatencyTimingConstraintWrapper {

    
    
    private ScopeRef_LatencyTimingConstraint scopeRef_LatencyTimingConstraint;

    public ScopeRef_LatencyTimingConstraintWrapper(ScopeRef_LatencyTimingConstraint scopeRef_LatencyTimingConstraint) {
        this.scopeRef_LatencyTimingConstraint = scopeRef_LatencyTimingConstraint;
    }

   
    public TimingDescriptionEventChainSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(scopeRef_LatencyTimingConstraint.getDest())) {
            
            return scopeRef_LatencyTimingConstraint.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getScopeRef_LatencyTimingConstraintObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = scopeRef_LatencyTimingConstraint.getValue();
        java.lang.String type = scopeRef_LatencyTimingConstraint.getDest().toString().replace("_", "-");
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

    
    public TimingDescriptionEventChainWrapper getTimingDescriptionEventChain() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = scopeRef_LatencyTimingConstraint.getValue();
        java.lang.String type = scopeRef_LatencyTimingConstraint.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TimingDescriptionEventChain){
            return new TimingDescriptionEventChainWrapper((TimingDescriptionEventChain) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}