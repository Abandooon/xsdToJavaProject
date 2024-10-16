package stdgui.data.model.modelwrapper;


    
    


     

public class PhysicalRequestRefWrapper {

    
    
    private PhysicalRequestRef physicalRequestRef;

    public PhysicalRequestRefWrapper(PhysicalRequestRef physicalRequestRef) {
        this.physicalRequestRef = physicalRequestRef;
    }

   
    public TpConnectionIdentSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(physicalRequestRef.getDest())) {
            
            return physicalRequestRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getPhysicalRequestRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = physicalRequestRef.getValue();
        java.lang.String type = physicalRequestRef.getDest().toString().replace("_", "-");
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

    
    public TpConnectionIdentWrapper getTpConnectionIdent() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = physicalRequestRef.getValue();
        java.lang.String type = physicalRequestRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof TpConnectionIdent){
            return new TpConnectionIdentWrapper((TpConnectionIdent) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}