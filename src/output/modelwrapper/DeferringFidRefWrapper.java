package stdgui.data.model.modelwrapper;


    
    


     

public class DeferringFidRefWrapper {

    
    
    private DeferringFidRef deferringFidRef;

    public DeferringFidRefWrapper(DeferringFidRef deferringFidRef) {
        this.deferringFidRef = deferringFidRef;
    }

   
    public FunctionInhibitionNeedsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(deferringFidRef.getDest())) {
            
            return deferringFidRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getDeferringFidRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = deferringFidRef.getValue();
        java.lang.String type = deferringFidRef.getDest().toString().replace("_", "-");
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

    
    public FunctionInhibitionNeedsWrapper getFunctionInhibitionNeeds() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = deferringFidRef.getValue();
        java.lang.String type = deferringFidRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FunctionInhibitionNeeds){
            return new FunctionInhibitionNeedsWrapper((FunctionInhibitionNeeds) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}