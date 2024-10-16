package stdgui.data.model.modelwrapper;


    
    


     

public class AgingRefWrapper {

    
    
    private AgingRef agingRef;

    public AgingRefWrapper(AgingRef agingRef) {
        this.agingRef = agingRef;
    }

   
    public DiagnosticAgingSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(agingRef.getDest())) {
            
            return agingRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAgingRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = agingRef.getValue();
        java.lang.String type = agingRef.getDest().toString().replace("_", "-");
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

    
    public DiagnosticAgingWrapper getDiagnosticAging() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = agingRef.getValue();
        java.lang.String type = agingRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof DiagnosticAging){
            return new DiagnosticAgingWrapper((DiagnosticAging) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}