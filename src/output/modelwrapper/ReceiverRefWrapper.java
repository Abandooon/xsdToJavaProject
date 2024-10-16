package stdgui.data.model.modelwrapper;


    
    


     

public class ReceiverRefWrapper {

    
    
    private ReceiverRef receiverRef;

    public ReceiverRefWrapper(ReceiverRef receiverRef) {
        this.receiverRef = receiverRef;
    }

   
    public CanTpNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(receiverRef.getDest())) {
            
            return receiverRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getReceiverRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = receiverRef.getValue();
        java.lang.String type = receiverRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = receiverRef.getValue();
        java.lang.String type = receiverRef.getDest().toString().replace("_", "-");
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