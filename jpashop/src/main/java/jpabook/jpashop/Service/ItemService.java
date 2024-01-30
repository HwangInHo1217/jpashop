package jpabook.jpashop.Service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {

    private final ItemRespository itemRespository;

    @Transactional
    public void saveItem(Item item){
        itemRespository.save(item);
    }

    public List<Item> findItems() {
        return itemRespository.findAll();
    }
    public Item findOne(Long itemId){
        return itemRespository.findOne(itemId);
    }
}
