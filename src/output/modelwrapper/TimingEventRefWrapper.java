package stdgui.data.model.modelwrapper;


    
    


     

public class TimingEventRefWrapper {

    
    
    private TimingEventRef timingEventRef;

    public TimingEventRefWrapper(TimingEventRef timingEventRef) {
        this.timingEventRef = timingEventRef;
    }

   
    public TimingEventSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(timingEventRef.getDest())) {
            
            return timingEventRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTimingEventRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = timingEventRef.getValue();
        java.lang.String type = timingEventRef.getDest().toString().replace("_", "-");
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

    
    public TimingEventWrapper getTimingEvent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = timingEventRef.getValue();
        java.lang.String type = timingEventRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TimingEvent){
            return new TimingEventWrapper((TimingEvent) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}