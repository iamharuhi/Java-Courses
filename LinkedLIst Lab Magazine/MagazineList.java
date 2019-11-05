//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList
{
   private MagazineNode list;
   private MagazineNode listLC;
   private MagazineNode listRC;
   //----------------------------------------------------------------
   //  Sets up an initially empty list of magazines.
   //----------------------------------------------------------------
   public MagazineList()
   {
      list = null;
      listLC = null;
      listRC = null;
   }

   //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the end of
   //  the linked list.
   //----------------------------------------------------------------
   public void add(Magazine mag)
   {
      MagazineNode node = new MagazineNode(mag);
      MagazineNode current;

      if (list == null)
         list = node;
      else
      {
         current = list;
         while (current.next != null)
            current = current.next;
         current.next = node;
      }
   }

   public void addLC(Magazine mag)
   {
      MagazineNode node = new MagazineNode(mag);
      MagazineNode current;

      if (listLC == null)
         listLC = node;
      else
      {
         current = listLC;
         while (current.next != null)
            current = current.next;
         current.next = node;
      }
   }
   
   public void addRC(Magazine mag)
   {
      MagazineNode node = new MagazineNode(mag);
      MagazineNode current;

      if (listRC == null)
         listRC = node;
      else
      {
         current = listRC;
         while (current.next != null)
            current = current.next;
         current.next = node;
      }
   }
   
   //----------------------------------------------------------------
   //  Returns this list of magazines as a string.
   //----------------------------------------------------------------
   public String toString()
   {
      String result = "";

      MagazineNode current = list;
      MagazineNode currentLC = listLC;
      MagazineNode currentRC = listRC;

      while (current != null)
      {
         result += current.magazine + "\n";
         current = current.next;
         result += currentLC.magazine + "\t";
         currentLC = currentLC.next;
         result += currentRC.magazine + "\n";
         currentRC = currentRC.next;
      }

      return result;
   }

   //*****************************************************************
   //  An inner class that represents a node in the magazine list.
   //  The public variables are accessed by the MagazineList class.
   //*****************************************************************
   private class MagazineNode
   {
      public Magazine magazine;
      public MagazineNode next;

      //--------------------------------------------------------------
      //  Sets up the node
      //--------------------------------------------------------------
      public MagazineNode(Magazine mag)
      {
         magazine = mag;
         next = null;
      }
   }
}
