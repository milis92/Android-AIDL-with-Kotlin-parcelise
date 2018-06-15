package forestgump.kotlin_playground.iservice;

import forestgump.kotlin_playground.entity.Product;
import forestgump.kotlin_playground.iservice.ICallback;

interface IService {

    List<Product> getAll();
    oneway void delete(long id, ICallback callback);
    oneway void add(in Product product, ICallback callback);
}
