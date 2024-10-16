package stdgui.data.model.modelwrapper;


    
    


     
         import stdgui.data.model.orimodel.System;
     

public class EcuExtractRefWrapper {

    
    
    private EcuExtractRef ecuExtractRef;

    public EcuExtractRefWrapper(EcuExtractRef ecuExtractRef) {
        this.ecuExtractRef = ecuExtractRef;
    }

   
    public SystemSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(ecuExtractRef.getDest())) {
            
            return ecuExtractRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getEcuExtractRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = ecuExtractRef.getValue();
        java.lang.String type = ecuExtractRef.getDest().toString().replace("_", "-");
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

    
    public SystemWrapper getSystem() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = ecuExtractRef.getValue();
        java.lang.String type = ecuExtractRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof System){
            return new SystemWrapper((System) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}