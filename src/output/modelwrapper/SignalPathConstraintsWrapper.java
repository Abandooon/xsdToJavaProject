package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SignalPathConstraintsWrapper {

    
    private SignalPathConstraints signalPathConstraints;

    public SignalPathConstraintsWrapper(SignalPathConstraints signalPathConstraints) {
        this.signalPathConstraints = signalPathConstraints;
    }

   
    public ArrayList<CommonSignalPathWrapper> getCommonSignalPath() {
        
        if (CollUtil.isNotEmpty(signalPathConstraints.getCommonSignalPath())) {
            ArrayList<CommonSignalPath> originalList = signalPathConstraints.getCommonSignalPath();
            ArrayList<CommonSignalPathWrapper> wrapperList = (ArrayList<CommonSignalPathWrapper>)originalList.stream()
                .map(item -> new CommonSignalPathWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ForbiddenSignalPathWrapper> getForbiddenSignalPath() {
        
        if (CollUtil.isNotEmpty(signalPathConstraints.getForbiddenSignalPath())) {
            ArrayList<ForbiddenSignalPath> originalList = signalPathConstraints.getForbiddenSignalPath();
            ArrayList<ForbiddenSignalPathWrapper> wrapperList = (ArrayList<ForbiddenSignalPathWrapper>)originalList.stream()
                .map(item -> new ForbiddenSignalPathWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PermissibleSignalPathWrapper> getPermissibleSignalPath() {
        
        if (CollUtil.isNotEmpty(signalPathConstraints.getPermissibleSignalPath())) {
            ArrayList<PermissibleSignalPath> originalList = signalPathConstraints.getPermissibleSignalPath();
            ArrayList<PermissibleSignalPathWrapper> wrapperList = (ArrayList<PermissibleSignalPathWrapper>)originalList.stream()
                .map(item -> new PermissibleSignalPathWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SeparateSignalPathWrapper> getSeparateSignalPath() {
        
        if (CollUtil.isNotEmpty(signalPathConstraints.getSeparateSignalPath())) {
            ArrayList<SeparateSignalPath> originalList = signalPathConstraints.getSeparateSignalPath();
            ArrayList<SeparateSignalPathWrapper> wrapperList = (ArrayList<SeparateSignalPathWrapper>)originalList.stream()
                .map(item -> new SeparateSignalPathWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}