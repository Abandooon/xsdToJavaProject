package stdgui.data.model.modelwrapper;


    
    


     

public class ISignalIPduRefWrapper {

    
    
    private ISignalIPduRef iSignalIPduRef;

    public ISignalIPduRefWrapper(ISignalIPduRef iSignalIPduRef) {
        this.iSignalIPduRef = iSignalIPduRef;
    }

   
    public ISignalIPduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(iSignalIPduRef.getDest())) {
            
            return iSignalIPduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getISignalIPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = iSignalIPduRef.getValue();
        java.lang.String type = iSignalIPduRef.getDest().toString().replace("_", "-");
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

    
    public ISignalIPduWrapper getISignalIPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = iSignalIPduRef.getValue();
        java.lang.String type = iSignalIPduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPdu){
            return new ISignalIPduWrapper((ISignalIPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}