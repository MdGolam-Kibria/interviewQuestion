package com.CrackCode.interviewQuestion.ApachePoi;

public interface SpreadSheetReader {
    /**
     *
     * @param cells - how many cells
     * @param listener
     */
    public void setContentReadListener(int cells, ContentReadListener listener);

    /**
     *
     * @param sheetIndex
     */
    public void execute(int sheetIndex);
}
