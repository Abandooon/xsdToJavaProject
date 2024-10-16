package stdgui.data.model.modelwrapper;


    
    


     

public class TpAddressRef_CanTpNodeWrapper {

    
    
    private TpAddressRef_CanTpNode tpAddressRef_CanTpNode;

    public TpAddressRef_CanTpNodeWrapper(TpAddressRef_CanTpNode tpAddressRef_CanTpNode) {
        this.tpAddressRef_CanTpNode = tpAddressRef_CanTpNode;
    }

   
    public CanTpAddressSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(tpAddressRef_CanTpNode.getDest())) {
            
            return tpAddressRef_CanTpNode.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTpAddressRef_CanTpNodeObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = tpAddressRef_CanTpNode.getValue();
        java.lang.String type = tpAddressRef_CanTpNode.getDest().toString().replace("_", "-");
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
        java.lang.String path = tpAddressRef_CanTpNode.getValue();
        java.lang.String type = tpAddressRef_CanTpNode.getDest().toString().replace("_", "-");
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