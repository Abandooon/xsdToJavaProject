package stdgui.data.model.modelwrapper;


    
    


public class CompuScalesWrapper {

    
    private CompuScales compuScales;

    public CompuScalesWrapper(CompuScales compuScales) {
        this.compuScales = compuScales;
    }

   
    public ArrayList<CompuScaleWrapper> getCompuScale() {
        
        if (CollUtil.isNotEmpty(compuScales.getCompuScale())) {
            ArrayList<CompuScale> originalList = compuScales.getCompuScale();
            ArrayList<CompuScaleWrapper> wrapperList = (ArrayList<CompuScaleWrapper>)originalList.stream()
                .map(item -> new CompuScaleWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}