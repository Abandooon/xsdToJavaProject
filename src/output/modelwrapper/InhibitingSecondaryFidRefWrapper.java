package stdgui.data.model.modelwrapper;


    
    


     

public class InhibitingSecondaryFidRefWrapper {

    
    
    private InhibitingSecondaryFidRef inhibitingSecondaryFidRef;

    public InhibitingSecondaryFidRefWrapper(InhibitingSecondaryFidRef inhibitingSecondaryFidRef) {
        this.inhibitingSecondaryFidRef = inhibitingSecondaryFidRef;
    }

   
    public FunctionInhibitionNeedsSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(inhibitingSecondaryFidRef.getDest())) {
            
            return inhibitingSecondaryFidRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getInhibitingSecondaryFidRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = inhibitingSecondaryFidRef.getValue();
        java.lang.String type = inhibitingSecondaryFidRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = inhibitingSecondaryFidRef.getValue();
        java.lang.String type = inhibitingSecondaryFidRef.getDest().toString().replace("_", "-");
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