package stdgui.data.model.modelwrapper;


    
    


     

public class TransmitterRefWrapper {

    
    
    private TransmitterRef transmitterRef;

    public TransmitterRefWrapper(TransmitterRef transmitterRef) {
        this.transmitterRef = transmitterRef;
    }

   
    public CanTpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(transmitterRef.getDest())) {
            
            return transmitterRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTransmitterRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = transmitterRef.getValue();
        java.lang.String type = transmitterRef.getDest().toString().replace("_", "-");
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

    
    public CanTpNodeWrapper getCanTpNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = transmitterRef.getValue();
        java.lang.String type = transmitterRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanTpNode){
            return new CanTpNodeWrapper((CanTpNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}