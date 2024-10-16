package stdgui.data.model.modelwrapper;


    
    


     

public class ISignalInIPduRefWrapper {

    
    
    private ISignalInIPduRef iSignalInIPduRef;

    public ISignalInIPduRefWrapper(ISignalInIPduRef iSignalInIPduRef) {
        this.iSignalInIPduRef = iSignalInIPduRef;
    }

   
    public ISignalToIPduMappingSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(iSignalInIPduRef.getDest())) {
            
            return iSignalInIPduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getISignalInIPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = iSignalInIPduRef.getValue();
        java.lang.String type = iSignalInIPduRef.getDest().toString().replace("_", "-");
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

    
    public ISignalToIPduMappingWrapper getISignalToIPduMapping() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = iSignalInIPduRef.getValue();
        java.lang.String type = iSignalInIPduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalToIPduMapping){
            return new ISignalToIPduMappingWrapper((ISignalToIPduMapping) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}