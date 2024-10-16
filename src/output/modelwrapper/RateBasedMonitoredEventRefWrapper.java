package stdgui.data.model.modelwrapper;


    
    


     

public class RateBasedMonitoredEventRefWrapper {

    
    
    private RateBasedMonitoredEventRef rateBasedMonitoredEventRef;

    public RateBasedMonitoredEventRefWrapper(RateBasedMonitoredEventRef rateBasedMonitoredEventRef) {
        this.rateBasedMonitoredEventRef = rateBasedMonitoredEventRef;
    }

   
    public DiagnosticEventNeedsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(rateBasedMonitoredEventRef.getDest())) {
            
            return rateBasedMonitoredEventRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRateBasedMonitoredEventRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = rateBasedMonitoredEventRef.getValue();
        java.lang.String type = rateBasedMonitoredEventRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticEventNeedsWrapper getDiagnosticEventNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = rateBasedMonitoredEventRef.getValue();
        java.lang.String type = rateBasedMonitoredEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticEventNeeds){
            return new DiagnosticEventNeedsWrapper((DiagnosticEventNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}