package stdgui.data.model.modelwrapper;


    
    


     

public class MulticastRefWrapper {

    
    
    private MulticastRef multicastRef;

    public MulticastRefWrapper(MulticastRef multicastRef) {
        this.multicastRef = multicastRef;
    }

   
    public TpAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(multicastRef.getDest())) {
            
            return multicastRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getMulticastRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = multicastRef.getValue();
        java.lang.String type = multicastRef.getDest().toString().replace("_", "-");
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

    
    public TpAddressWrapper getTpAddress() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = multicastRef.getValue();
        java.lang.String type = multicastRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TpAddress){
            return new TpAddressWrapper((TpAddress) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}