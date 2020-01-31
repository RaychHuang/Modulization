package com.ray.utopia.datacell;

import io.reactivex.Observable;

public interface DataCellShell<State, Message> extends DataCell<State, Message> {

    Observable<Object> listenIntent();

    void deliverReducer(Reducer<State> reducer);

    void deliverMessage(Message reducer);
}
