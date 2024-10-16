package stdgui.data.model.modelwrapper;


    
    


     

public class TxPduPoolRefWrapper {

    
    
    private TxPduPoolRef txPduPoolRef;

    public TxPduPoolRefWrapper(TxPduPoolRef txPduPoolRef) {
        this.txPduPoolRef = txPduPoolRef;
    }

   
    public FlexrayTpPduPoolSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(txPduPoolRef.getDest())) {
            
            return txPduPoolRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getTxPduPoolRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = txPduPoolRef.getValue();
        java.lang.String type = txPduPoolRef.getDest().toString().replace("_", "-");
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

    
    public FlexrayTpPduPoolWrapper getFlexrayTpPduPool() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = txPduPoolRef.getValue();
        java.lang.String type = txPduPoolRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayTpPduPool){
            return new FlexrayTpPduPoolWrapper((FlexrayTpPduPool) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}