import { FC, ReactNode, useState } from 'react';

interface ParentComponentProps {
  render: (data: string[]) => ReactNode;
}

export const ParentComponent: FC<ParentComponentProps> = ({ render }) => {
  const [data] = useState<string[]>([ "Apple", "Banana", "Orange" ]);

  return (
    <ul>
      {render(data)}
    </ul>
  );
}