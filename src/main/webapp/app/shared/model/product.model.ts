export interface IProduct {
  id?: number;
  name?: string;
  price?: number;
  description?: string;
  quantity?: number;
  imageContentType?: string;
  image?: any;
  replacements?: IProduct[];
  ownerLogin?: string;
  ownerId?: number;
  replacedName?: string;
  replacedId?: number;
}

export class Product implements IProduct {
  constructor(
    public id?: number,
    public name?: string,
    public price?: number,
    public description?: string,
    public quantity?: number,
    public imageContentType?: string,
    public image?: any,
    public replacements?: IProduct[],
    public ownerLogin?: string,
    public ownerId?: number,
    public replacedName?: string,
    public replacedId?: number
  ) {}
}
