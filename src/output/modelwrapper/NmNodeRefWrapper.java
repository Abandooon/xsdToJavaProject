package stdgui.data.model.modelwrapper;


    
    


     

     

     

     

public class NmNodeRefWrapper {

    
    
    private NmNodeRef nmNodeRef;

    public NmNodeRefWrapper(NmNodeRef nmNodeRef) {
        this.nmNodeRef = nmNodeRef;
    }

   
    public NmNodeSubtypesEnum getDest() {
        
        if (CollUtil.isNotEmpty(nmNodeRef.getDest())) {
            
            return nmNodeRef.getDest();
            
        } else {
            return null;
        }
        
    }




    
    public Object getNmNodeRefObj() throws BaseXException, ClassNotFoundException, JAXBException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.String path = nmNodeRef.getValue();
        java.lang.String type = nmNodeRef.getDest().toString().replace("_", "-");
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

    
    public CanNmNodeWrapper getCanNmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nmNodeRef.getValue();
        java.lang.String type = nmNodeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof CanNmNode){
            return new CanNmNodeWrapper((CanNmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public FlexrayNmNodeWrapper getFlexrayNmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nmNodeRef.getValue();
        java.lang.String type = nmNodeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof FlexrayNmNode){
            return new FlexrayNmNodeWrapper((FlexrayNmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public J1939NmNodeWrapper getJ1939NmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nmNodeRef.getValue();
        java.lang.String type = nmNodeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof J1939NmNode){
            return new J1939NmNodeWrapper((J1939NmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    public UdpNmNodeWrapper getUdpNmNode() throws BaseXException, ClassNotFoundException, JAXBException{
        java.lang.String path = nmNodeRef.getValue();
        java.lang.String type = nmNodeRef.getDest().toString().replace("_", "-");
        SchemaController schemaController = (SchemaController) RestrictDTO.controllerMap.get("schemaController");
        Iproject currentProject = (Iproject) ApplicationContextUtil.applicationContext.get("currentProject");
        Object queryObject = schemaController.queryObject(currentProject.getName(), path, type);
        
        if(queryObject instanceof UdpNmNode){
            return new UdpNmNodeWrapper((UdpNmNode) queryObject);
        }else{
            return null;
        }
        
    }
    
    


    
}