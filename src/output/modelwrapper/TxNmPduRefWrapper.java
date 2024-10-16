package stdgui.data.model.modelwrapper;


    
    


     

public class TxNmPduRefWrapper {

    
    
    private TxNmPduRef txNmPduRef;

    public TxNmPduRefWrapper(TxNmPduRef txNmPduRef) {
        this.txNmPduRef = txNmPduRef;
    }

   
    public NmPduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(txNmPduRef.getDest())) {
            
            return txNmPduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTxNmPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = txNmPduRef.getValue();
        java.lang.String type = txNmPduRef.getDest().toString().replace("_", "-");
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

    
    public NmPduWrapper getNmPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = txNmPduRef.getValue();
        java.lang.String type = txNmPduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NmPdu){
            return new NmPduWrapper((NmPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}