package stdgui.data.model.modelwrapper;


    
    


     

public class ProvidedServiceInstanceRefWrapper {

    
    
    private ProvidedServiceInstanceRef providedServiceInstanceRef;

    public ProvidedServiceInstanceRefWrapper(ProvidedServiceInstanceRef providedServiceInstanceRef) {
        this.providedServiceInstanceRef = providedServiceInstanceRef;
    }

   
    public ProvidedServiceInstanceSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(providedServiceInstanceRef.getDest())) {
            
            return providedServiceInstanceRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getProvidedServiceInstanceRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = providedServiceInstanceRef.getValue();
        java.lang.String type = providedServiceInstanceRef.getDest().toString().replace("_", "-");
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

    
    public ProvidedServiceInstanceWrapper getProvidedServiceInstance() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = providedServiceInstanceRef.getValue();
        java.lang.String type = providedServiceInstanceRef.getDest().toString().replace("_", "-");
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