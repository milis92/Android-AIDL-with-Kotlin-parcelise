package forestgump.kotlin_playground.iservice;

import forestgump.kotlin_playground.entity.Product;

oneway interface ICallback {

    void addedItemId(long id);
    void isItemDeleted(boolean isDeleted);
}