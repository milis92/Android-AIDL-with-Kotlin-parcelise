package forestgump.kotlin_playground.iservice;

import forestgump.kotlin_playground.entity.Product;

interface ICallback {

   oneway void addedItemId(long id);
   oneway void isItemDeleted(boolean isDeleted);

}