package stdgui.data.model.modelwrapper;


    
    


     

public class CanTpAddressRefWrapper {

    
    
    private CanTpAddressRef canTpAddressRef;

    public CanTpAddressRefWrapper(CanTpAddressRef canTpAddressRef) {
        this.canTpAddressRef = canTpAddressRef;
    }

   
    public CanTpAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(canTpAddressRef.getDest())) {
            
            return canTpAddressRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getCanTpAddressRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = canTpAddressRef.getValue();
        java.lang.String type = canTpAddressRef.getDest().toString().replace("_", "-");
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

    
    public CanTpAddressWrapper getCanTpAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = canTpAddressRef.getValue();
        java.lang.String type = canTpAddressRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpAddress){
            return new CanTpAddressWrapper((CanTpAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}