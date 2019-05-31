package com.company;

public class NODES <T>
{
T data;
NODES  prev;
NODES next;

public NODES(T data,NODES<T> prev,NODES<T> next)
{
    this.data=data;
    this.prev=prev;
    this.next=next;

}

}
