package stdgui.data.model.modelwrapper;


    
    


     

public class UsedSecondaryFidRefWrapper {

    
    
    private UsedSecondaryFidRef usedSecondaryFidRef;

    public UsedSecondaryFidRefWrapper(UsedSecondaryFidRef usedSecondaryFidRef) {
        this.usedSecondaryFidRef = usedSecondaryFidRef;
    }

   
    public FunctionInhibitionNeedsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(usedSecondaryFidRef.getDest())) {
            
            return usedSecondaryFidRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getUsedSecondaryFidRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = usedSecondaryFidRef.getValue();
        java.lang.String type = usedSecondaryFidRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = usedSecondaryFidRef.getValue();
        java.lang.String type = usedSecondaryFidRef.getDest().toString().replace("_", "-");
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