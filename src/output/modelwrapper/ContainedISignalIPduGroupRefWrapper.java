package stdgui.data.model.modelwrapper;


    
    


     

public class ContainedISignalIPduGroupRefWrapper {

    
    
    private ContainedISignalIPduGroupRef containedISignalIPduGroupRef;

    public ContainedISignalIPduGroupRefWrapper(ContainedISignalIPduGroupRef containedISignalIPduGroupRef) {
        this.containedISignalIPduGroupRef = containedISignalIPduGroupRef;
    }

   
    public ISignalIPduGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(containedISignalIPduGroupRef.getDest())) {
            
            return containedISignalIPduGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getContainedISignalIPduGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = containedISignalIPduGroupRef.getValue();
        java.lang.String type = containedISignalIPduGroupRef.getDest().toString().replace("_", "-");
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

    
    public ISignalIPduGroupWrapper getISignalIPduGroup() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = containedISignalIPduGroupRef.getValue();
        java.lang.String type = containedISignalIPduGroupRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof ISignalIPduGroup){
            return new ISignalIPduGroupWrapper((ISignalIPduGroup) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}