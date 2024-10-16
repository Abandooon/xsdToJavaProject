package stdgui.data.model.modelwrapper;


    
    


     

     

public class ServiceInstanceRefWrapper {

    
    
    private ServiceInstanceRef serviceInstanceRef;

    public ServiceInstanceRefWrapper(ServiceInstanceRef serviceInstanceRef) {
        this.serviceInstanceRef = serviceInstanceRef;
    }

   
    public AbstractServiceInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(serviceInstanceRef.getDest())) {
            
            return serviceInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getServiceInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = serviceInstanceRef.getValue();
        java.lang.String type = serviceInstanceRef.getDest().toString().replace("_", "-");
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

    
    public ConsumedServiceInstanceWrapper getConsumedServiceInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef.getValue();
        java.lang.String type = serviceInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ConsumedServiceInstance){
            return new ConsumedServiceInstanceWrapper((ConsumedServiceInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    public ProvidedServiceInstanceWrapper getProvidedServiceInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = serviceInstanceRef.getValue();
        java.lang.String type = serviceInstanceRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ProvidedServiceInstance){
            return new ProvidedServiceInstanceWrapper((ProvidedServiceInstance) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}