package stdgui.data.model.modelwrapper;


    
    


     

public class ISignalTriggeringRefWrapper {

    
    
    private ISignalTriggeringRef iSignalTriggeringRef;

    public ISignalTriggeringRefWrapper(ISignalTriggeringRef iSignalTriggeringRef) {
        this.iSignalTriggeringRef = iSignalTriggeringRef;
    }

   
    public ISignalTriggeringSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(iSignalTriggeringRef.getDest())) {
            
            return iSignalTriggeringRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getISignalTriggeringRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = iSignalTriggeringRef.getValue();
        java.lang.String type = iSignalTriggeringRef.getDest().toString().replace("_", "-");
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

    
    public ISignalTriggeringWrapper getISignalTriggering() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = iSignalTriggeringRef.getValue();
        java.lang.String type = iSignalTriggeringRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalTriggering){
            return new ISignalTriggeringWrapper((ISignalTriggering) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}