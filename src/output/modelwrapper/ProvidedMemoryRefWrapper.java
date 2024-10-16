package stdgui.data.model.modelwrapper;


    
    


     

public class ProvidedMemoryRefWrapper {

    
    
    private ProvidedMemoryRef providedMemoryRef;

    public ProvidedMemoryRefWrapper(ProvidedMemoryRef providedMemoryRef) {
        this.providedMemoryRef = providedMemoryRef;
    }

   
    public HwElementSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(providedMemoryRef.getDest())) {
            
            return providedMemoryRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getProvidedMemoryRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = providedMemoryRef.getValue();
        java.lang.String type = providedMemoryRef.getDest().toString().replace("_", "-");
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

    
    public HwElementWrapper getHwElement() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = providedMemoryRef.getValue();
        java.lang.String type = providedMemoryRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof HwElement){
            return new HwElementWrapper((HwElement) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}