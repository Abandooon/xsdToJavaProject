package stdgui.data.model.modelwrapper;


    
    


     

public class DataPduRefWrapper {

    
    
    private DataPduRef dataPduRef;

    public DataPduRefWrapper(DataPduRef dataPduRef) {
        this.dataPduRef = dataPduRef;
    }

   
    public NPduSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(dataPduRef.getDest())) {
            
            return dataPduRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDataPduRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = dataPduRef.getValue();
        java.lang.String type = dataPduRef.getDest().toString().replace("_", "-");
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

    
    public NPduWrapper getNPdu() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = dataPduRef.getValue();
        java.lang.String type = dataPduRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof NPdu){
            return new NPduWrapper((NPdu) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}