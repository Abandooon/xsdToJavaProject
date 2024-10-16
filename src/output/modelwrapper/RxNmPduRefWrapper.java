package stdgui.data.model.modelwrapper;


    
    


     

public class RxNmPduRefWrapper {

    
    
    private RxNmPduRef rxNmPduRef;

    public RxNmPduRefWrapper(RxNmPduRef rxNmPduRef) {
        this.rxNmPduRef = rxNmPduRef;
    }

   
    public NmPduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(rxNmPduRef.getDest())) {
            
            return rxNmPduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getRxNmPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = rxNmPduRef.getValue();
        java.lang.String type = rxNmPduRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = rxNmPduRef.getValue();
        java.lang.String type = rxNmPduRef.getDest().toString().replace("_", "-");
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