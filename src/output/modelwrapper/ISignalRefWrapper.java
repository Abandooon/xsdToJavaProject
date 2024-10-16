package stdgui.data.model.modelwrapper;


    
    


     

public class ISignalRefWrapper {

    
    
    private ISignalRef iSignalRef;

    public ISignalRefWrapper(ISignalRef iSignalRef) {
        this.iSignalRef = iSignalRef;
    }

   
    public ISignalSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(iSignalRef.getDest())) {
            
            return iSignalRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getISignalRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = iSignalRef.getValue();
        java.lang.String type = iSignalRef.getDest().toString().replace("_", "-");
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

    
    public ISignalWrapper getISignal() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = iSignalRef.getValue();
        java.lang.String type = iSignalRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignal){
            return new ISignalWrapper((ISignal) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}