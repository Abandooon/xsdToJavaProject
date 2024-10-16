package stdgui.data.model.modelwrapper;


    
    


     
         import stdgui.data.model.orimodel.SocketAddress;
     

public class LocalPortRefWrapper {

    
    
    private LocalPortRef localPortRef;

    public LocalPortRefWrapper(LocalPortRef localPortRef) {
        this.localPortRef = localPortRef;
    }

   
    public SocketAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(localPortRef.getDest())) {
            
            return localPortRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getLocalPortRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = localPortRef.getValue();
        java.lang.String type = localPortRef.getDest().toString().replace("_", "-");
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

    
    public SocketAddressWrapper getSocketAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = localPortRef.getValue();
        java.lang.String type = localPortRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof SocketAddress){
            return new SocketAddressWrapper((SocketAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}