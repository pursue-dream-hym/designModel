package design.pattern.flyweight;

import java.util.ArrayList;

public class WeiqiFactory {
  private ArrayList<ChessPieces> qz;

  public WeiqiFactory(){
      qz=new ArrayList<ChessPieces>();
      ChessPieces chesspieces=new WhitePieces();
      qz.add(chesspieces);
      ChessPieces chessPieces1=new BlackPieces();
      qz.add(chessPieces1);
  }

    public ChessPieces getChessPieces(String type)
    {
        if(type.equalsIgnoreCase("w"))
        {
            return (ChessPieces)qz.get(0);
        }
        else if(type.equalsIgnoreCase("b"))
        {
            return (ChessPieces)qz.get(1);
        }
        else
        {
            return null;
        }
    }

}
