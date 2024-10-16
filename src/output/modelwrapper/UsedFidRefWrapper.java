package stdgui.data.model.modelwrapper;


    
    


     

public class UsedFidRefWrapper {

    
    
    private UsedFidRef usedFidRef;

    public UsedFidRefWrapper(UsedFidRef usedFidRef) {
        this.usedFidRef = usedFidRef;
    }

   
    public FunctionInhibitionNeedsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(usedFidRef.getDest())) {
            
            return usedFidRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUsedFidRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = usedFidRef.getValue();
        java.lang.String type = usedFidRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = usedFidRef.getValue();
        java.lang.String type = usedFidRef.getDest().toString().replace("_", "-");
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