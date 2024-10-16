package stdgui.data.model.modelwrapper;


    
    


     

public class AssociatedComIPduGroupRefWrapper {

    
    
    private AssociatedComIPduGroupRef associatedComIPduGroupRef;

    public AssociatedComIPduGroupRefWrapper(AssociatedComIPduGroupRef associatedComIPduGroupRef) {
        this.associatedComIPduGroupRef = associatedComIPduGroupRef;
    }

   
    public ISignalIPduGroupSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(associatedComIPduGroupRef.getDest())) {
            
            return associatedComIPduGroupRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getAssociatedComIPduGroupRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = associatedComIPduGroupRef.getValue();
        java.lang.String type = associatedComIPduGroupRef.getDest().toString().replace("_", "-");
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
        java.lang.String path = associatedComIPduGroupRef.getValue();
        java.lang.String type = associatedComIPduGroupRef.getDest().toString().replace("_", "-");
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